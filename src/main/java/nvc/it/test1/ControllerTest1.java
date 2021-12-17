package nvc.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerTest1 {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "<center><h1> This root page </h1> <hr> <h3>สวัดดีชาวโลก!!!</h3>ตัวฉันชื่อ ก้องภพ อินทร์อยู่ <br><a href='/name'> <h4>Go to name page</a></h4></center> ";
    }
    

    @RequestMapping("/name")
    @ResponseBody
    public String name (){
        return "<center>This  page name kongpop </center> <a href='/'> Go to index page</a>";
    }

    @RequestMapping("/abut")
    @ResponseBody
    public String abut(){
        return "<center>This  page Abut !!!! </center>";
    }

    @RequestMapping("/contect")
    @ResponseBody
    public String contect(){
        return "<center>This  page Contect นานา? </center>";
    }


}
