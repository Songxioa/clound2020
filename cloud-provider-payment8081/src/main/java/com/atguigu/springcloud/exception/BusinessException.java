package com.atguigu.springcloud.exception;

/**
 * @author wq
 * @date 2019/6/3 17:09
 * @desc 业务异常
 **/
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	protected final String message;

	public BusinessException(String message) {
		this.message = message;
	}

	public BusinessException(String message, Throwable e) {
		super(message, e);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
