package com.ysi.openstack.cinder.model.volume.volume;

public class VolumeImageMetadata {
    private String description;
    private String checksum;
    private String min_ram;
    private String disk_format;
    private String image_name;
    private String image_id;
    private String signature_verified;
    private String container_format;
    private String min_disk;
    private String size;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getMin_ram() {
        return min_ram;
    }

    public void setMin_ram(String min_ram) {
        this.min_ram = min_ram;
    }

    public String getDisk_format() {
        return disk_format;
    }

    public void setDisk_format(String disk_format) {
        this.disk_format = disk_format;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getSignature_verified() {
        return signature_verified;
    }

    public void setSignature_verified(String signature_verified) {
        this.signature_verified = signature_verified;
    }

    public String getContainer_format() {
        return container_format;
    }

    public void setContainer_format(String container_format) {
        this.container_format = container_format;
    }

    public String getMin_disk() {
        return min_disk;
    }

    public void setMin_disk(String min_disk) {
        this.min_disk = min_disk;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}