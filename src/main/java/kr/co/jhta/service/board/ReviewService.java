package kr.co.jhta.service.board;

import java.util.List;

import kr.co.jhta.vo.Review;

public interface ReviewService {

	void addReview(Review review);

	List<Review> getAllReviewByNo(int bno);

}
