/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Abhisek Ashirbad Sethy
 * @date 31/03/2019
 * @version 1.0
 * 
 */
public class Name 
{
    private String prefix;
    private String firstname;
    private String middlename;
    private String lastname;
    private String suffix;
    private final String fullname = prefix+" "+firstname+" "+middlename+" "+lastname+" "+suffix;
    
    Name()
    {
        this.setPrefix(prefix);
        this.setFirstName(firstname);
        this.setMiddleName(middlename);
        this.setLastName(lastname);
        this.setSuffix(suffix);
    }
    
    private String getFullName()
    {
        return fullname;
    }
    
    private void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }
    
    private String getPrefix()
    {
        return prefix;
    }
    
    private void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }
    
    private String getFirstName()
    {
        return firstname;
    }
    
    private void setMiddleName(String middlename)
    {
        this.middlename = middlename;
    }
    
    private String getMiddleName()
    {
        return middlename;
    }
    
    private void setLastName(String lastname)
    {
        this.lastname = lastname;
    }
    
    private String getLastName()
    {
        return lastname;
    }
    
    private void setSuffix(String suffix)
    {
        this.suffix = suffix;
    }
    
    private String getSuffix()
    {
        return suffix;
    }
    
    private boolean validateName(String name)
    {
        boolean valid = false;
        if(name != null && !name.isEmpty())
        {
            for(char c : name.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    valid = false;
                }
                else
                {
                    valid = true;
                }
            }
        }
        else
            valid = false;
        return valid;
    }
}
