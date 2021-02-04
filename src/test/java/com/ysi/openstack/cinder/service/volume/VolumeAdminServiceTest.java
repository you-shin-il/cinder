package com.ysi.openstack.cinder.service.volume;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class VolumeAdminServiceTest {
    @Autowired
    private VolumeService volumeService;

    @Test
    @DisplayName("볼륨 목록 조회")
    void volumeList() {
    }
}