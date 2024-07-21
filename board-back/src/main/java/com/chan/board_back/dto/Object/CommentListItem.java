package com.chan.board_back.dto.Object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CommentListItem {
    private String nickname;
    private String profileImage;
    private String writeDatetime;
    private String content;


}
