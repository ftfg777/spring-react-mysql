import React from 'react';
import './style.css';
import { BoardListItem } from 'types/interface';

interface Props {
    boardListItem : BoardListItem
}

//          component: Board List Item 컴포넌트           //
export default function BoardListItem({boardListItem} : Props) {
//          props          //
const {boardNumber, title, content, boardTitleImage} = boardListItem;
const {favoriteCount,commentCount, viewCount} = boardListItem;
const {writeDatetime, writerNickname, writerProfileImage} = boardListItem;



//          reder: Board List Item 컴포넌트 렌더링          //
  return (
    <div className='board-list-item'>
        <div className='board-list-item-main-box'>    
            <div className='board-list-item-top'>

                <div className='board-list-item-profile-box'>
                    <div className='board-list-item-profile-image' style={{ backgroundImage : `url(${writerProfileImage ? writerProfileImage : 'data:image/jpeg;base64,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'})`}}></div>
                </div>

                <div className='board-list-item-write-box'>
                    <div className='board-list-item-nickname'>
                        {writerNickname}
                    </div>
                    <div className='board-list-item-write-date'>
                        {writeDatetime}
                    </div>
                </div>
            </div>

            <div className='board-list-item-middle'>
                <div className='board-list-item-title'>
                    {title}
                </div>
                <div className='board-list-item-content'>
                    {content}
                </div>
            </div>
            
            <div className='board-list-item-bottom'>
                <div className='board-list-item-counts'>
                    {`댓글 ${commentCount} 좋아요 ${favoriteCount} 조회수 ${viewCount}`}
                </div>
            </div>
        </div>

        <div className='board-list-item-image-box'>
            <div className='board-list-item-board-image' style={{backgroundImage : `url( ${boardTitleImage ? boardListItem : 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6tSweg4ctaRSx3cNVbOU0RZm0XBbKW6jNNg&s'})`}}></div>
        </div>
    
    </div>
  )
}
