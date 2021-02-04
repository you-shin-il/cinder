package com.ysi.openstack.cinder.model.volume.volume;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttachmentsVO {
    @JsonProperty("server_id")
    private String serverId;
    @JsonProperty("attachment_id")
    private String attachmentId;
    @JsonProperty("attached_at")
    private String attachedAt;
    @JsonProperty("host_name")
    private String hostName;
    @JsonProperty("volume_id")
    private String volumeId;
    private String device;
    private String id;

    public AttachmentsVO(String serverId, String attachmentId, String attachedAt, String hostName, String volumeId, String device, String id) {
        this.serverId = serverId;
        this.attachmentId = attachmentId;
        this.attachedAt = attachedAt;
        this.hostName = hostName;
        this.volumeId = volumeId;
        this.device = device;
        this.id = id;
    }
}