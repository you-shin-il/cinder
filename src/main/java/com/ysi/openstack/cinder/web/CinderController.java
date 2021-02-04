package com.ysi.openstack.cinder.web;

import com.ysi.openstack.cinder.model.volume.volume.Volume;
import com.ysi.openstack.cinder.model.volume.volume.VolumeRequestVO;
import com.ysi.openstack.cinder.model.volume.volume.create.CreateVolumeDTO;
import com.ysi.openstack.cinder.service.volume.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URISyntaxException;

@Controller
public class CinderController {
    @Autowired
    private VolumeService volumeService;

/*    @PostMapping("/cinder/volumes")
    @ResponseBody
    public Volume getCinderVolumes(@RequestBody(required = false) VolumeRequestVO volumeRequestVO) throws URISyntaxException {
        ResponseEntity<Volume> responseEntity = volumeService.volumes(volumeRequestVO);

        return responseEntity.getBody();
    }*/

    @GetMapping("/cinder/volumes")
    @ResponseBody
    public Volume getCinderVolumes(@RequestBody(required = false) VolumeRequestVO volumeRequestVO) throws URISyntaxException {
        ResponseEntity<Volume> responseEntity = volumeService.volumes(volumeRequestVO);
        return responseEntity.getBody();
    }

    @PostMapping("/cinder/create/volumes")
    @ResponseBody
    public void createCinderVolume(@RequestBody CreateVolumeDTO createVolumeDTO) {
        System.out.println("createVolumeDTO = " + createVolumeDTO);
    }
}