package pivotal.au.pas.platform.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;

import java.util.List;

@Controller
public class EmployeeController
{
    protected static Logger logger = Logger.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showEmps (Model model)
    {
        List<Employee> emps = employeeRepository.findAll();
        model.addAttribute("employees", emps);

        return "employees";
    }
}
