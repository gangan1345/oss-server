/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */
package com.xiaominfo.oss.service;

import com.baomidou.mybatisplus.service.IService;
import com.xiaominfo.oss.module.model.OSSAppInfo;
import com.xiaominfo.oss.module.model.OSSDeveloper;
import com.xiaominfo.oss.module.model.OSSInformation;
import com.xiaominfo.oss.module.model.OSSMaterialInfoSync;
import com.xiaominfo.oss.sdk.client.NettyFileRequest;

/***
 *
 * @since:cloud-ims 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2018/06/18 8:54
 */
public interface OSSMaterialInfoSyncService extends IService<OSSMaterialInfoSync> {


    OSSMaterialInfoSync createSync(String materialId, String Type);




    String buildPath(NettyFileRequest ef, OSSInformation ossInformation, OSSDeveloper ossDeveloper, OSSAppInfo ossApp);
}
