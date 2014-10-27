package com.mskiba.archetype.controller;


import com.mskiba.archetype.model.User;
import com.mskiba.archetype.service.UserService;
import com.mskiba.archetype.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/getJSON")
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    TestJSON getJSON() throws Exception {
        // Transaction tx = session.beginTransaction();
        User user = new User();
        user.setUsername("mskiba");
        user.setPassword("xyz123");
        user.setEmail("text@example.com");
        userService.save(user);
        // tx.commit();
        // session.close();
        if (1 < 2) {
            // throw new Exception();
        }
        return new TestJSON();
    }

    static class TestJSON {

        private String aaa = "aaa_val";
        private String bbb = "bbb_val";
        private String ccc = "ccc_val";

        public String getAaa() {
            return aaa;
        }

        public void setAaa(String aaa) {
            this.aaa = aaa;
        }

        public String getBbb() {
            return bbb;
        }

        public void setBbb(String bbb) {
            this.bbb = bbb;
        }

        public String getCcc() {
            return ccc;
        }

        public void setCcc(String ccc) {
            this.ccc = ccc;
        }
    }
}
