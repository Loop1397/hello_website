package com.zerobase.fastlms.admin.dto;

import java.time.LocalDateTime;

import com.zerobase.fastlms.member.entity.Member;

import lombok.Builder;
import lombok.Data;

//Member 엔티티클래스와는 다르게 데이터를 가공하여 가져옴
@Builder
@Data
public class MemberDto {
	
	String userId;
	String userName;
	String phone;
	String password;
	LocalDateTime regDt;
	
	boolean emailAuthYn;
	LocalDateTime emailAuthDt;
	String emailAuthKey;
	
	String resetPasswordKey;
	LocalDateTime resetPasswordLimitDt;
	
	boolean adminYn;
	
	
	//추가 컬럼
	long totalCount;
	long seq;
	
	
	public static MemberDto of(Member member) {
		
		return MemberDto.builder()
				.userId(member.getUserId())
				.userName(member.getUserName())
				.phone(member.getPhone())
				.regDt(member.getRegDt())
				.emailAuthYn(member.isEmailAuthYn())
				.emailAuthDt(member.getEmailAuthDt())
				.emailAuthKey(member.getEmailAuthKey())
//				.resetPasswordKey(member.getResetPasswordKey())
//				.resetPasswordLimitDt(member.getResetPasswordLimitDt())
//				.adminYn(member.isAdminYn())
				.build();
		
		
	}
}