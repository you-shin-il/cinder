package com.ysi.openstack.cinder.web;

import com.ysi.openstack.cinder.model.volume.volume.VolumeRequestVO;
import com.ysi.openstack.cinder.model.volume.volume.create.CreateVolumeDTO;
import com.ysi.openstack.cinder.service.volume.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
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
    public ResponseEntity<?> getCinderVolumes(@RequestBody(required = false) VolumeRequestVO volumeRequestVO) throws URISyntaxException {
	    return volumeService.volumes(volumeRequestVO);
/*        ResponseEntity<Volume> responseEntity = volumeService.volumes(volumeRequestVO);
        return responseEntity.getBody();*/
    }

    @PostMapping("/cinder/create/volumes")
    public void createCinderVolume(@RequestBody CreateVolumeDTO createVolumeDTO) {
        System.out.println("createVolumeDTO = " + createVolumeDTO);
    }
}