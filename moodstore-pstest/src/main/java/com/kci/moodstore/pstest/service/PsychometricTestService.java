package com.kci.moodstore.pstest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kci.moodstore.pstest.model.PsychometricTest;

public interface PsychometricTestService extends IService<PsychometricTest> {

    /**
     *  用户端
     *      1. 用户点击喜欢，能在我的喜欢中找到
     *      2. 用户测试完成将测试的结果保存到数据库
     *      3. 用户点击封面，从数据库和阿里云中拿到图片url（第一次点击，以后就直接缓存拿），将整个测试的属性保存到缓存，再呈现给用户
     *      4. 用户点击开始测试，根据测试Id从阿里云拿到Json.txt转成列表返回给前端
     *      5. 能根据测试type返回不同的各种测试
     *      6. 能根据（名称 or Id），查找到测试详情
     *      ....
     *      暂时只想到这一些
     */


    /**
     *  管理员端
     *      1. 带图片的添加，题目保存为Json.txt存在阿里OSS
     *      2. 删除
     *      3. 修改
     *      4. 各种查询
     *      5. 带状态的修改
     *      ....
     *      暂时只想到这一些
     */


}
