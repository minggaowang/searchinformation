package cn.com.searchinformation.processor;

import cn.com.searchinformation.model.SysUserModel;
import cn.com.searchinformation.service.PGSQLBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class SysUserProcessor implements ItemProcessor<SysUserModel,SysUserModel> {
    private static final Logger log = LoggerFactory.getLogger(SysUserProcessor.class);
    @Autowired
    private PGSQLBaseService pgsqlBaseService;

    @Override
    public SysUserModel process(SysUserModel sysUserModel) throws Exception {
        return null;
    }
}
