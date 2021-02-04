package com.ysi.openstack.cinder.model.volume.volume;

import java.util.List;

public class Volume {
    private List<VolumeVO> volumes;

    public List<VolumeVO> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeVO> volumes) {
        this.volumes = volumes;
    }
}
