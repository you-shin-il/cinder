package com.ysi.openstack.cinder.model.volume.volume;

public class VolumeRequestVO {
    private VolumeQueryStringVO volumeQueryStringVO;
    private VolumeVO volumeVO;

    public VolumeQueryStringVO getVolumeQueryStringVO() {
        return volumeQueryStringVO;
    }

    public void setVolumeQueryStringVO(VolumeQueryStringVO volumeQueryStringVO) {
        this.volumeQueryStringVO = volumeQueryStringVO;
    }

    public VolumeVO getVolumeVO() {
        return volumeVO;
    }

    public void setVolumeVO(VolumeVO volumeVO) {
        this.volumeVO = volumeVO;
    }

    @Override
    public String toString() {
        return "VolumeRequestVO{" +
                "volumeQueryStringVO=" + volumeQueryStringVO +
                ", volumeVO=" + volumeVO +
                '}';
    }
}