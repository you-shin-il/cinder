package com.ysi.openstack.cinder.service.volume;

import com.ysi.openstack.cinder.model.volume.volume.VolumeRequestVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class VolumeAdminService extends VolumeService {

    public ResponseEntity volumes(VolumeRequestVO volumeRequestVO) throws URISyntaxException {
        return super.volumes(volumeRequestVO);
    }
}