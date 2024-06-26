package fideco.notice.dto;

public class NoticeDTO {
	private int notice_num;
	private String notice_title;
	private String notice_content;
	private String notice_writer;
	private String notice_registday;
	private int notice_hit;

	public int getNotice_num() {
		return notice_num;
	}

	public void setNotice_num(int notice_num) {
		this.notice_num = notice_num;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	public String getNotice_writer() {
		return notice_writer;
	}

	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}

	public String getNotice_registday() {
		return notice_registday;
	}

	public void setNotice_registday(String notice_registday) {
		this.notice_registday = notice_registday;
	}

	public int getNotice_hit() {
		return notice_hit;
	}

	public void setNotice_hit(int notice_hit) {
		this.notice_hit = notice_hit;
	}

	@Override
	public String toString() {
		return "NoticeDTO [notice_num=" + notice_num + ", notice_title=" + notice_title + ", notice_content="
				+ notice_content + ", notice_writer=" + notice_writer + ", notice_registday=" + notice_registday
				+ ", notice_hit=" + notice_hit + "]";
	}

}
