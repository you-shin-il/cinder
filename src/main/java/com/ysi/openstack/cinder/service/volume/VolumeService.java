package com.ysi.openstack.cinder.service.volume;

import com.ysi.comm.rest.model.RestParamVO;
import com.ysi.comm.rest.service.impl.OpnstackRestApiService;
import com.ysi.comm.util.HeaderUtil;
import com.ysi.comm.util.URIBuilderUtils;
import com.ysi.openstack.cinder.model.volume.volume.Volume;
import com.ysi.openstack.cinder.model.volume.volume.VolumeRequestVO;
import com.ysi.openstack.cinder.url.CinderApiURL;
import com.ysi.openstack.comm.OpenstackService;
import com.ysi.openstack.keystone.model.token.Token;
import com.ysi.openstack.keystone.service.KeystoneService;
import com.ysi.openstack.project.Project;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class VolumeService extends OpenstackService {
    @Value("${cinder.port}")
    private int cinderPort;

    @Autowired
    private KeystoneService keystoneService;

    @Autowired
    private OpnstackRestApiService opnstackRestApiService;

    public ResponseEntity volumes(VolumeRequestVO volumeRequestVO) throws URISyntaxException {
        RestParamVO restParamVO = getRestParamVO(volumeRequestVO, CinderApiURL.projectId_VOLUMES_DETAIL);

        ResponseEntity responseEntity = opnstackRestApiService.call(restParamVO, HttpMethod.GET);
        //ResponseEntity<Project> projects = keystoneService.getProjects();
        return responseEntity;
    }

    private RestParamVO getRestParamVO(VolumeRequestVO volumeRequestVO, CinderApiURL apiURL) throws URISyntaxException {
        List<NameValuePair> nameValuePairs = volumeRequestVO != null ? volumeRequestVO.getVolumeQueryStringVO().getListBasicNameValuePair() : null;
        //List<NameValuePair> listBasicNameValuePair = volumeRequestVO.getVolumeQueryStringVO().getListBasicNameValuePair();
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(
                            openstackIp,
                            String.format(apiURL.getUrl(), "014d1be7dd9e475ea06f603300b864cb"),
                            cinderPort,
                            nameValuePairs);

        ResponseEntity<Token> responseEntity = keystoneService.getToken("ptlkim", "cone@234", "014d1be7dd9e475ea06f603300b864cb");
        String x_subject_token = responseEntity.getHeaders().get("X-Subject-Token").stream().findFirst().get();
        HttpHeaders headers = HeaderUtil.getHeader();
        headers.add("X-Auth-Token", x_subject_token);

        return new RestParamVO(uriBuilder, headers, null, new ParameterizedTypeReference<Volume>() {});
    }
}