package com.ysi.openstack.cinder.url;

public enum CinderApiURL {
    projectId_VOLUMES_DETAIL("/v3/%s/volumes/detail"),                  //GET
    projectId_VOLUMES_volumeId("/v3/%s/volumes/%s"),                    //GET, PUT, DELETE
    projectId_VOLUMES_volumeId_ACTION("/v3/%s/volumes/%s/action"),      //POST
    projectId_SNAPSHOTS_DETAIL("/v3/%s/snapshots/detail");              //GET

    private String url;

    CinderApiURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}