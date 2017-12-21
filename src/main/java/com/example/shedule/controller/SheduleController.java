package com.example.shedule.controller;

        import com.example.shedule.service.SheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SheduleController {
    @Autowired
    SheduleService service;

    @RequestMapping ("/entity")
 public ModelAndView doHome(){
    ModelAndView mv=new ModelAndView("index");
    mv.addObject("lists",service.getShedule());
    return mv;
    }


/*  @RequestMapping(path = "/entity", method = RequestMethod.GET)
  public ResponseEntity<List<Shedule>> getEntity(){
        return new ResponseEntity(service.getShedule(), HttpStatus.OK);
    }*/
}

