package com.shoppingmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.shoppingmall.model.ReviewTab;

@Mapper
public interface ReviewTabMapper {

	@Select("select * from review_tab")
//	@Results(id="ReviewTabMap", value= {
//		@Result(property = "product_name", column = "product_id", many=@Many(select="com.shoppingmall.mapper.ProductsMapper.getProductName")),	
//		@Result(property ="productDetailsList", column="product_detail_id", many=@Many(select="com.shoppingmall.mapper.ProductDetailsMapper.getAllProductDetails"))
//	})
	List<ReviewTab> getAll();
	
	@Select("select * from review_tab where review_id=#{review_id}")
//	@ResultMap("ReviewTabMap")
	ReviewTab getReviewTab(@Param("review_id")int review_id);
	
	@Insert("INSERT INTO review_tab(product_id,user_sequence_id,product_detail_id, review, star, review_picture,"
			+ "review_date_created) VALUES(#{reviewTab.product_id}, #{reviewTab.user_sequence_id},"
			+ "#{reviewTab.product_detail_id},#{reviewTab.review},#{reviewTab.star},"
			+ "#{reviewTab.review_picture},now())")
	@Options(useGeneratedKeys = true, keyProperty = "review_id")
	int insertReviewTab(@Param("reviewTab") ReviewTab reviewTab);
	
	@Update("UPDATE review_tab SET product_id=#{product_id}, user_sequence_id=#{user_sequence_id}, "
			+ "product_detail_id=#{product_detail_id}, review=#{review}, star=#{star}, "
			+ "review_picture=#{review_picture} WHERE review_id=#{review_id}")
	int updateReviewTab(@Param("product_id") int product_id,@Param("user_sequence_id") int user_sequence_id,
			@Param("product_detail_id") int product_detail_id,@Param("review") String review,
			@Param("star") float star,@Param("review_picture") String review_picture,
			@Param("review_id") int review_id);
	
	@Delete("DELETE FROM review_tab WHERE review_id=#{review_id}")
	int deleteReviewTab(@Param("review_id")int review_id);
}
