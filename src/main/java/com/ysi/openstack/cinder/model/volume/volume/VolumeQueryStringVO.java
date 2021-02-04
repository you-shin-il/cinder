package com.ysi.openstack.cinder.model.volume.volume;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class VolumeQueryStringVO {
    private String volumeId;
    private String snapshotId;
    private String name;
    private Boolean bootable;
    private Status status;

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isBootable() {
        return bootable;
    }

    public void setBootable(boolean bootable) {
        this.bootable = bootable;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<NameValuePair> getListBasicNameValuePair() {
        List<NameValuePair> result = new ArrayList<>();

        if(volumeId != null) {
            result.add(new BasicNameValuePair("volumeId", getVolumeId()));
        }

        if(snapshotId != null) {
            result.add(new BasicNameValuePair("snapshotId", getSnapshotId()));
        }

        if(name != null) {
            result.add(new BasicNameValuePair("name", getName()));
        }

        if(bootable != null) {
            result.add(new BasicNameValuePair("bootable", isBootable().toString()));
        }

        if(status != null) {
            result.add(new BasicNameValuePair("status", getStatus().getStatus()));
        }

        return result;
    }
}