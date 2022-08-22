package Details;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Classdetails")

public class Classdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="Class")
	private String ClassName;
	@Column(name="Section")
	private String ClassSection;
	@Column(name="Room_No")
	private String ClassRoomNo;
	
	public Classdetails() {}
	
	public Classdetails(String className, String classSection, String classRoomNo) {
		ClassName = className;
		ClassSection = classSection;
		ClassRoomNo = classRoomNo;
	}
	
	public Classdetails(int id, String className, String classSection, String classRoomNo) {
		super();
		Id = id;
		ClassName = className;
		ClassSection = classSection;
		ClassRoomNo = classRoomNo;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public String getClassSection() {
		return ClassSection;
	}

	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}

	public String getClassRoomNo() {
		return ClassRoomNo;
	}

	public void setClassRoomNo(String classRoomNo) {
		ClassRoomNo = classRoomNo;
	}
	@Override
	public String toString() {
		return "Classdetails [Id=" + Id + ", ClassName=" + ClassName + ", ClassSection=" + ClassSection
				+ ", ClassRoomNo=" + ClassRoomNo + "]";
	}
	
}

