package Details;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Subjectdetails")
public class Subjectdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="Subject_Name")
	private String SubjectName;
	@Column(name="Subject_Code")
	private String SubjectCode;
	@Column(name="Subject_Teacher")
	private String SubjectTeacher;
	
	public Subjectdetails() {}
	
	public Subjectdetails(String subjectName, String subjectCode, String subjectTeacher) {
		SubjectName = subjectName;
		SubjectCode = subjectCode;
		SubjectTeacher = subjectTeacher;
	}
	
	public Subjectdetails(int id, String subjectName, String subjectCode, String subjectTeacher) {
		super();
		Id = id;
		SubjectName = subjectName;
		SubjectCode = subjectCode;
		SubjectTeacher = subjectTeacher;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public String getSubjectCode() {
		return SubjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		SubjectCode = subjectCode;
	}

	public String getSubjectTeacher() {
		return SubjectTeacher;
	}

	public void setSubjectTeacher(String subjectTeacher) {
		SubjectTeacher = subjectTeacher;
	}
	@Override
	public String toString() {
		return "Subjectdetails [Id=" + Id + ", SubjectName=" + SubjectName + ", SubjectCode=" + SubjectCode
				+ ", SubjectTeacher=" + SubjectTeacher + "]";
	}
}
