package cn.com.searchinformation.service.impl;

import cn.com.searchinformation.dao.PGSQLBaseDao;
import cn.com.searchinformation.model.ITDepartmentModel;
import cn.com.searchinformation.model.ProblemTypeCountModel;
import cn.com.searchinformation.model.RegisterCountModel;
import cn.com.searchinformation.service.PGSQLBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PGSQLBaseServiceImpl implements PGSQLBaseService {

    @Autowired
    private PGSQLBaseDao pgsqlBaseDao;

    @Override
    public RegisterCountModel selectRegistersCount() {
        return pgsqlBaseDao.selectRegistersCount();
    }

    @Override
    public List<ProblemTypeCountModel> selectProblemTypeCount(){
        return pgsqlBaseDao.selectProblemTypeCount();
    }

    @Override
    public List<ITDepartmentModel> selectITDepartmentCount(){
        return pgsqlBaseDao.selectITDepartmentCount();
    }

}
