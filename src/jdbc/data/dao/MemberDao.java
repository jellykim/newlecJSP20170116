package jdbc.data.dao;

import java.util.List;

import jdbc.data.entity.Member;

/**
 * Member Controller
 */
public interface MemberDao {
	List<Member> getList(String query);
	// getList() ?
	List<Member> getList();
	int add(Member member);
	String update(Member member);
	int delete(Member member);
}
