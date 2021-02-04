package com.ysi.openstack.keystone.model.token;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CatalogVO {
    private List<Endpoints> endpoints;
    private String type;
    private String id;
    private String name;

    public static class Endpoints {
        @JsonProperty("region_id")
        private String regionId;
        private String url;
        private String region;
        @JsonProperty("interface")
        private String _interface;
        private String getRegion_id;

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getGetRegion_id() {
            return getRegion_id;
        }

        public void setGetRegion_id(String getRegion_id) {
            this.getRegion_id = getRegion_id;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Endpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoints> endpoints) {
        this.endpoints = endpoints;
    }
}