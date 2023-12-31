package edu.ncsu.csc.iTrust2.controllers.routing;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ncsu.csc.iTrust2.models.enums.Role;

/**
 * Controller to manage basic abilities for ER roles
 *
 * @author Amalan Iyengar
 *
 */

@Controller
public class ERController {

    /**
     * Returns the ER for the given model
     *
     * @param model
     *            model to check
     * @return role
     */
    @RequestMapping ( value = "er/index" )
    @PreAuthorize ( "hasRole('ROLE_ER')" )
    public String index ( final Model model ) {
        return Role.ROLE_ER.getLanding();
    }

    /**
     * Returns the ER for the given model
     *
     * @param model
     *            model to check
     * @return role
     */
    @RequestMapping ( value = "er/records" )
    @PreAuthorize ( "hasRole('ROLE_ER')" )
    public String emergencyRecords ( final Model model ) {
        return "personnel/records"; 
    }

    /**
     * Returns the form page for a ER to view emergency health records
     *
     * @param model
     *            Data for the front end
     * @return The page to display to the user
     */
    @GetMapping ( "/er/viewEmergencyHealthRecords" )
    @PreAuthorize ( "hasRole('ROLE_ER')" )
    public String viewEmergencyHealthRecords ( final Model model ) {
        return "er/viewEmergencyHealthRecords";
    }

}
