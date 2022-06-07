package com.vti.ultis;

import java.sql.ResultSet;
import java.time.LocalDateTime;

public class sqlUltis {
	public static  LocalDateTime geLocalDateTime(ResultSet resultSet, String columnName) {
		try {
			return resultSet.getTimestamp(columnName).toLocalDateTime();
		} catch (Exception e) {
			return null;
		}
	}
}
