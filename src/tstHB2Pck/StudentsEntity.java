package tstHB2Pck;

import javax.persistence.*;

/**
 * @author sbt-kazakov-no
 * @ created 13.02.2017
 * @ $Author$
 * @ $Revision$
 */
@Entity
@Table(name = "students", schema = "", catalog = "")
public class StudentsEntity
{
  private Integer id;
  private String name;
  
  @Id
  @Column(name = "id")
  public Integer getId()
  {
    return id;
  }
  
  public void setId(Integer id)
  {
    this.id = id;
  }
  
  @Basic
  @Column(name = "name")
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object o)
  {
    if(this == o)
      return true;
    if(o == null || getClass() != o.getClass())
      return false;
    
    StudentsEntity that = (StudentsEntity)o;
    
    if(id != null ? !id.equals(that.id) : that.id != null)
      return false;
    if(name != null ? !name.equals(that.name) : that.name != null)
      return false;
    
    return true;
  }
  
  @Override
  public int hashCode()
  {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}
