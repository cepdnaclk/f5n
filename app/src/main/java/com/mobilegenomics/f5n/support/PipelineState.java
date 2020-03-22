package com.mobilegenomics.f5n.support;

public enum PipelineState {
    STATE_ZERO,
    TO_BE_CONFIGURED,
    CONFIGURED,
    RUNNING,
    COMPLETED,
    PREV_CONFIG_LOAD,
    MINIT_DOWNLOAD,
    MINIT_EXTRACT,
    MINIT_CONFIGURE,
    MINIT_COMPRESS,
    MINIT_UPLOAD
}
