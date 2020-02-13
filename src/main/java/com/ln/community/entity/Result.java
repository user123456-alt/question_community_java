package com.ln.community.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回插入、删除、修改是否成功
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result implements Serializable {
  private Integer status; // 200 成功 400 失败
  private String ErrorMsg; // 错误信息
}