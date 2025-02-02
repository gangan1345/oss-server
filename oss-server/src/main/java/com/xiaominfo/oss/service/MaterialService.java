/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */
package com.xiaominfo.oss.service;

import com.xiaominfo.oss.domain.FileBinaryRequest;
import com.xiaominfo.oss.domain.FileBinaryResponse;
import com.xiaominfo.oss.module.model.OSSAppInfo;
import com.xiaominfo.oss.module.model.OSSDeveloper;
import com.xiaominfo.oss.module.model.OSSInformation;
import com.xiaominfo.oss.sdk.client.NettyFileRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/***
 *
 * @since:cloud-ims 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2018/05/30 10:53
 */
public interface MaterialService {
    /***
     * 存储binary二进制文件
     * @param fileBinaryRequests
     * @return
     */
    List<FileBinaryResponse> saveAndStore(OSSInformation ossInformation, OSSDeveloper ossDeveloper, OSSAppInfo ossApp, File projectDirectory, List<FileBinaryRequest> fileBinaryRequests) throws IOException;

    /**
     * 保存文件
     * @param ossInformation
     * @param ossDeveloper
     * @param ossApp
     * @param projectDirectory
     * @param file
     * @return
     * @throws IOException
     */
    FileBinaryResponse saveAndStore(OSSInformation ossInformation, OSSDeveloper ossDeveloper, OSSAppInfo ossApp,
                                    NettyFileRequest ef, File file) throws IOException;


    /***
     * 存储文件
     * @param projectDirectory
     * @param multipartFile
     * @return
     */
    List<FileBinaryResponse> saveAndStore(OSSInformation ossInformation, OSSDeveloper ossDeveloper, OSSAppInfo ossApp, File projectDirectory, MultipartFile[] multipartFile) throws IOException;


    List<FileBinaryResponse> saveAndStoreBySys(OSSInformation ossInformation, File projectDirectory, MultipartFile[] multipartFile) throws IOException;


}
