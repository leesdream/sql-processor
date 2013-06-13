package org.sample.web.app;

import org.sample.dao.UserDao;
import org.sample.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.SqlControl;

public class UserService {

    protected UserDao userDao;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(readOnly = true)
    public User getUser(User user, SqlControl sqlControl) throws Exception {
        logger.info("getUser -> " + user + ", " + sqlControl);

        user = userDao.get(user, sqlControl);
        logger.info("getUser <- " + user);

        return user;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
