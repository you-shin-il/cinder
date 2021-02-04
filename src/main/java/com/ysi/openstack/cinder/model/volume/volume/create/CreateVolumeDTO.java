package com.ysi.openstack.cinder.model.volume.volume.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

import java.util.Map;

public class CreateVolumeDTO {

    private Volume volume;

    @JsonRawValue
    @JsonProperty("OS-SCH-HNT:scheduler_hints")
    private Map<String, Object> osSchHntSchedulerHints;

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public Object getOsSchHntSchedulerHints() {
        return osSchHntSchedulerHints;
    }

    public void setOsSchHntSchedulerHints(Map<String, Object> osSchHntSchedulerHints) {
        this.osSchHntSchedulerHints = osSchHntSchedulerHints;
    }

    public static class Volume {
        private int size;
        private String availability_zone;
        private String source_volid;
        private String description;
        private boolean multiattach;
        private String snapshot_id;
        private String back_id;
        private String name;
        private String imageRef;
        private String volume_type;
        private Map<String, Object> metadata;
        private String consistencygroup_id;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getAvailability_zone() {
            return availability_zone;
        }

        public void setAvailability_zone(String availability_zone) {
            this.availability_zone = availability_zone;
        }

        public String getSource_volid() {
            return source_volid;
        }

        public void setSource_volid(String source_volid) {
            this.source_volid = source_volid;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isMultiattach() {
            return multiattach;
        }

        public void setMultiattach(boolean multiattach) {
            this.multiattach = multiattach;
        }

        public String getSnapshot_id() {
            return snapshot_id;
        }

        public void setSnapshot_id(String snapshot_id) {
            this.snapshot_id = snapshot_id;
        }

        public String getBack_id() {
            return back_id;
        }

        public void setBack_id(String back_id) {
            this.back_id = back_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImageRef() {
            return imageRef;
        }

        public void setImageRef(String imageRef) {
            this.imageRef = imageRef;
        }

        public String getVolume_type() {
            return volume_type;
        }

        public void setVolume_type(String volume_type) {
            this.volume_type = volume_type;
        }

        public Map<String, Object> getMetadata() {
            return metadata;
        }

        public void setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
        }

        public String getConsistencygroup_id() {
            return consistencygroup_id;
        }

        public void setConsistencygroup_id(String consistencygroup_id) {
            this.consistencygroup_id = consistencygroup_id;
        }
    }

/*    @JsonRootName(value = "OS-SCH-HNT:scheduler_hints")
    public static class OsSchHntSchedulerHints {
        private Object same_host;

        public Object getSame_host() {
            return same_host;
        }

        public void setSame_host(Object same_host) {
            this.same_host = same_host;
        }
    }*/
}