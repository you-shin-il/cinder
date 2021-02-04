package com.ysi.bim.model;

import java.util.List;

public class Notice {
    private List<NoticeVO> data;
    private Page page;

    public List<NoticeVO> getData() {
        return data;
    }

    public void setData(List<NoticeVO> data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
