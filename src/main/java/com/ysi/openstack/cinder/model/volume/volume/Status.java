package com.ysi.openstack.cinder.model.volume.volume;

public enum Status {
    CREATING("creating"),
    AVAILABLE("available"),
    reserved("reserved"),
    attaching("attaching"),
    detaching("detaching"),
    inUse("in-use"),
    maintenance("maintenance"),
    deleting("deleting"),
    awaitingTransfer("awaiting-transfer"),
    error("error"),
    errorDeleting("error_deleting"),
    backingUp("backing-up"),
    restoringBackup("restoring-backup"),
    errorBackingUp("error_backing-up"),
    errorRestoring("error_restoring"),
    errorExtending("error_extending"),
    downloading("downloading"),
    uploading("uploading"),
    retyping("retyping"),
    extending("extending");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}