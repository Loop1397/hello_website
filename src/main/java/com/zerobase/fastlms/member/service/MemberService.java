package com.zerobase.fastlms.member.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zerobase.fastlms.admin.dto.MemberDto;
import com.zerobase.fastlms.admin.model.MemberParam;
import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.model.ResetPasswordInput;

public interface MemberService extends UserDetailsService {
	
	boolean register(MemberInput parameter);
	
	/**
	 * uuid에 해당하는 계정을 활성화 함.
	 * @param uuid
	 * @return
	 */
	
	boolean emailAuth(String uuid);

	/**
	 * 입력한 이메일로 비밀번호 초기화 정보를 전송하는 메소드 
	 * @param parameter
	 * @return
	 */
	boolean sendResetPassword(ResetPasswordInput parameter);

	/**
	 * 입력받은 uuid에 대해서 password로 초기화 함
	 * @param id
	 * @param password
	 * @return
	 */
	boolean resetPassword(String uuid, String password);

	/**
	 * 입력받은 uuid값이 유효한지 확인
	 * @param uuid
	 * @return
	 */
	boolean checkResetPassword(String uuid);

	/**
	 * 회원 목록 확인/리턴(관리자에서만 사용 가능)
	 * @return
	 */
	List<MemberDto> list(MemberParam parameter);

	/**
	 * 회원 상세 정보를 가져오는 메소드
	 * @param userId
	 * @return
	 */
	MemberDto detail(String userId);
	
}