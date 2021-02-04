package com.ysi.openstack.cinder.model.volume.volume;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class VolumeVO {
    @JsonProperty("migration_status")
    String migrationStatus;
    private List<AttachmentsVO> attachments;
    List<LinksVO> links;
    @JsonProperty("availability_zone")
    String availabilityZone;
    @JsonProperty("os-vol-host-attr:host")
    String osVolHostAttrHost;
    boolean encrypted;
    @JsonProperty("updated_at")
    LocalDateTime updatedAt;
    boolean bootable;
    @JsonProperty("consistencygroup_id")
    String consistencygroupId;
    @JsonProperty("created_at")
    LocalDateTime createdAt;
    String description;
    String id;
    Map<String, Object> metadata;
    boolean multiattach;
    String name;
    @JsonProperty("os-vol-mig-status-attr:migstat")
    String osVolMigStatusAttrMigstat;
    @JsonProperty("os-vol-mig-status-attr:name_id")
    String osVolMigStatusAttrNameId;
    @JsonProperty("os-vol-tenant-attr:tenant_id")
    String osVolTenantAttrTenantId;
    @JsonProperty("replication_status")
    String replication_status;
    int size;
    @JsonProperty("snapshot_id")
    String snapshotId;
    @JsonProperty("source_volid")
    String sourceVolid;
    String status;
    @JsonProperty("volume_image_metadata")
    VolumeImageMetadata volumeImageMetadata;
    @JsonProperty("user_id")
    String userId;
    @JsonProperty("volume_type")
    String volumeType;
    private List<String> actions;

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public List<AttachmentsVO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentsVO> attachments) {
        this.attachments = attachments;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public boolean isBootable() {
        return bootable;
    }

    public void setBootable(boolean bootable) {
        this.bootable = bootable;
    }

    public String getConsistencygroupId() {
        return consistencygroupId;
    }

    public void setConsistencygroupId(String consistencygroupId) {
        this.consistencygroupId = consistencygroupId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LinksVO> getLinks() {
        return links;
    }

    public void setLinks(List<LinksVO> links) {
        this.links = links;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getMigrationStatus() {
        return migrationStatus;
    }

    public void setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
    }

    public boolean isMultiattach() {
        return multiattach;
    }

    public void setMultiattach(boolean multiattach) {
        this.multiattach = multiattach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOsVolHostAttrHost() {
        return osVolHostAttrHost;
    }

    public void setOsVolHostAttrHost(String osVolHostAttrHost) {
        this.osVolHostAttrHost = osVolHostAttrHost;
    }

    public String getOsVolMigStatusAttrMigstat() {
        return osVolMigStatusAttrMigstat;
    }

    public void setOsVolMigStatusAttrMigstat(String osVolMigStatusAttrMigstat) {
        this.osVolMigStatusAttrMigstat = osVolMigStatusAttrMigstat;
    }

    public String getOsVolMigStatusAttrNameId() {
        return osVolMigStatusAttrNameId;
    }

    public void setOsVolMigStatusAttrNameId(String osVolMigStatusAttrNameId) {
        this.osVolMigStatusAttrNameId = osVolMigStatusAttrNameId;
    }

    public String getOsVolTenantAttrTenantId() {
        return osVolTenantAttrTenantId;
    }

    public void setOsVolTenantAttrTenantId(String osVolTenantAttrTenantId) {
        this.osVolTenantAttrTenantId = osVolTenantAttrTenantId;
    }

    public String getReplication_status() {
        return replication_status;
    }

    public void setReplication_status(String replication_status) {
        this.replication_status = replication_status;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSourceVolid() {
        return sourceVolid;
    }

    public void setSourceVolid(String sourceVolid) {
        this.sourceVolid = sourceVolid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeImageMetadata getVolumeImageMetadata() {
        return volumeImageMetadata;
    }

    public void setVolumeImageMetadata(VolumeImageMetadata volumeImageMetadata) {
        this.volumeImageMetadata = volumeImageMetadata;
    }
}