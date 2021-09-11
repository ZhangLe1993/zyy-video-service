<template>
  <el-card style="height: calc(100% - 9px); overflow: auto;">
    <div class="container--2z-xy container--3HDWY chat-container-box--3SEQG">
      <div class="semi-tabs semi-tabs-top">
        <div role="tab-content" class="semi-tabs-content semi-tabs-content-top">
          <div role="tab-panel" class="chat-content--2ioZk semi-tabs-pane-active semi-tabs-pane" aria-hidden="false">
            <div class="semi-tabs-pane-motion-overlay" style="opacity: 1;">
              <div class="list--Utujj collapsed--zB87v">
                <div class="box-list-header--1b11B"><h1>私信列表</h1></div>
                <div class="semi-list semi-list-default semi-list-split">
                  <div class="semi-spin semi-spin-large semi-spin-block semi-spin-hidden">
                    <div class="semi-spin-children">
                      <ul class="semi-list-items" style="position: relative;">
                        <div style="overflow: visible; width: 0px;">
                          <div style="box-sizing: border-box; direction: ltr; position: relative; width: 300px; will-change: transform; overflow: auto;">
                            <div class="ReactVirtualized__Grid__innerScrollContainer" role="rowgroup"
                                 style="width: auto; height: 525px; max-width: 300px; max-height: 525px; overflow: hidden; position: relative;">
                              <div style="height: 105px; left: 0px; position: absolute; top: 0px; width: 100%;">
                                <li class="semi-list-item active--3c4rW" v-for="item in userList" :key="item.userId">
                                  <div class="semi-list-item-body semi-list-item-body-flex-start">
                                    <div class="semi-list-item-body-header">
                                      <a>
                                        <span class="semi-badge">
                                          <span class="semi-avatar semi-avatar-circle semi-avatar-medium semi-avatar-img">
                                            <img :src="item.avatar">
                                          </span>
                                          <span class="semi-badge-primary semi-badge-solid semi-badge-rightTop" style="top: 5px; right: 5px;"></span>
                                        </span>
                                      </a>
                                    </div>
                                    <div class="semi-list-item-body-main">
                                      <div class="item--KCnu1">
                                        <div class="item-left--3c9d4">
                                          <div class="item-header--TmWg0">
                                            <div class="item-header-left--2PGUO"><span class="item-header-name--2tELM"
                                                                                       style="color: rgba(22,24,35,0.5); font-weight: 500; cursor: pointer;">{{item.nickname}}</span>
                                            </div>
                                            <span class="item-header-time--1wYfQ">07-02</span></div>
                                          <div class="item-content--1_Hjv">
                                            <div class="text--qZ234">不能听的太多了</div>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                  </div>
                                </li>
                              </div>
                              <div style="height: 105px; left: 0px; position: absolute; top: 420px; width: 100%;">
                                <div class="status-wrapper--2kAAJ">
                                  <div class="no-more-tip--3wQql">没有更多了~</div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="resize-triggers">
                          <div class="expand-trigger">
                            <div style="width: 301px; height: 323px;"></div>
                          </div>
                          <div class="contract-trigger"></div>
                        </div>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="box-container--3RkLr">
        <div class="box-header--6FAQc">
          <div><strong class="box-header-name--2ha--">╬▍▓ぷ⊙●瑾</strong><span class="" style="display: inline-block;">查看Ta的主页</span>
          </div>
          <div class="box-header-tail--1FRis">
            <svg class="semi-icons semi-icons-more semi-icons-default" aria-hidden="true">
              <use xlink:href="#semi-icons-more"></use>
            </svg>
          </div>
        </div>
        <div class="box-content--3kEi6">
          <button class="semi-button semi-button-primary semi-button-size-small semi-button-light box-loadmore--17rAs"
                  type="button"><span class="semi-button-content">加载</span></button>
          <div>
            <div class="box-item--TSTUb is-me--Ynj3O">
              <div class="box-item-message--G-9W6">
                <pre class="text--4pkER">不平等条约</pre>
              </div>
            </div>
            <div class="box-item--TSTUb"><span
                class="semi-avatar semi-avatar-circle semi-avatar-medium semi-avatar-grey"
                style="background-image: url(//thirdqq.qlogo.cn/qqapp/1105602870/B1E20CD90A9808AA7A46D13CAC5C6457/40), url(//sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/3793/3131589739~120x256.image); background-size: cover; width: 20px; height: 20px; margin-right: 6px;"></span>
              <div class="box-item-message--G-9W6">
                <pre class="text--4pkER">多平等啊</pre>
              </div>
            </div>
          </div>
          <div class="loading-screen--3gvJR"></div>
        </div>
        <div class="chat-editor--1P4YJ">
          <div class="chat-input--3G9Sm" contenteditable="true"></div>
          <div class="empty--12JDA">发送消息...</div>
          <div class="chat-footer--3o0AH"><img class="chat-sticker--2BtO-"
                                               src="data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMjAiIGhlaWdodD0iMjAiIHZpZXdCb3g9IjAgMCAyMCAyMCIgZmlsbD0ibm9uZSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KPHBhdGggZmlsbC1ydWxlPSJldmVub2RkIiBjbGlwLXJ1bGU9ImV2ZW5vZGQiIGQ9Ik05Ljk5OTg0IDE4LjMzMzRDMTQuNjAyMiAxOC4zMzM0IDE4LjMzMzIgMTQuNjAyNCAxOC4zMzMyIDEwQzE4LjMzMzIgNS4zOTc2NSAxNC42MDIyIDEuNjY2NjkgOS45OTk4NCAxLjY2NjY5QzUuMzk3NDYgMS42NjY2OSAxLjY2NjUgNS4zOTc2NSAxLjY2NjUgMTBDMS42NjY1IDE0LjYwMjQgNS4zOTc0NiAxOC4zMzM0IDkuOTk5ODQgMTguMzMzNFoiIGZpbGw9IiMxQzFGMjMiIGZpbGwtb3BhY2l0eT0iMC4zIi8+CjxwYXRoIGZpbGwtcnVsZT0iZXZlbm9kZCIgY2xpcC1ydWxlPSJldmVub2RkIiBkPSJNNy4wODM1IDkuNTgzMzNDNy43NzM4NSA5LjU4MzMzIDguMzMzNSA4LjgzNzE0IDguMzMzNSA3LjkxNjY3QzguMzMzNSA2Ljk5NjE5IDcuNzczODUgNi4yNSA3LjA4MzUgNi4yNUM2LjM5MzE0IDYuMjUgNS44MzM1IDYuOTk2MTkgNS44MzM1IDcuOTE2NjdDNS44MzM1IDguODM3MTQgNi4zOTMxNCA5LjU4MzMzIDcuMDgzNSA5LjU4MzMzWiIgZmlsbD0id2hpdGUiIGZpbGwtb3BhY2l0eT0iMC45Ii8+CjxwYXRoIGZpbGwtcnVsZT0iZXZlbm9kZCIgY2xpcC1ydWxlPSJldmVub2RkIiBkPSJNMTIuOTE2NSA5LjU4MzMzQzEzLjYwNjkgOS41ODMzMyAxNC4xNjY1IDguODM3MTQgMTQuMTY2NSA3LjkxNjY3QzE0LjE2NjUgNi45OTYxOSAxMy42MDY5IDYuMjUgMTIuOTE2NSA2LjI1QzEyLjIyNjEgNi4yNSAxMS42NjY1IDYuOTk2MTkgMTEuNjY2NSA3LjkxNjY3QzExLjY2NjUgOC44MzcxNCAxMi4yMjYxIDkuNTgzMzMgMTIuOTE2NSA5LjU4MzMzWiIgZmlsbD0id2hpdGUiIGZpbGwtb3BhY2l0eT0iMC45Ii8+CjxwYXRoIGZpbGwtcnVsZT0iZXZlbm9kZCIgY2xpcC1ydWxlPSJldmVub2RkIiBkPSJNNy41IDExLjU3M0M3LjUgMTIuNTU5MiA4LjYxOTI5IDEzLjM1ODcgMTAgMTMuMzU4N0MxMS4zODA3IDEzLjM1ODcgMTIuNSAxMi41NTkyIDEyLjUgMTEuNTczQzEyLjUgMTAuNTg2OCA3LjUgMTAuNTg2OCA3LjUgMTEuNTczWiIgZmlsbD0id2hpdGUiIGZpbGwtb3BhY2l0eT0iMC45Ii8+Cjwvc3ZnPgo=">
            <button disabled="" class="semi-button semi-button-disabled chat-btn" type="button"
                    style="margin-right: 0px;"><span class="semi-button-content">发送</span></button>
          </div>
        </div>
      </div>
    </div>
  </el-card>
</template>

<script>
export default {
  name: "MessageManage",
  data() {
    return {
      userList: [
        {
          avatar: "https://p26.douyinpic.com/img/tos-cn-avt-0015/495ec5cc4c85a35b2ae141f9ef7fca1c~c5_720x720.jpeg?from=4010531038",
          nickname: "TT",
          userId: "b"
        },
        {
          avatar: "https://p9.douyinpic.com/aweme/720x720/2d59000039ca1688d215d.jpeg?from=4010531038",
          nickname: "冰凌",
          userId: "c"
        }
      ],
    }
  },

}
</script>

<style scoped>
.chat-container-box--3SEQG {
  padding: 0 !important;
  -moz-box-orient: horizontal !important;
  -moz-box-direction: normal !important;
  -ms-flex-direction: row !important;
  flex-direction: row !important;
  height: 100%;
}

.container--3HDWY {
  height: -moz-calc(100vh - 208px);
  height: calc(100vh - 208px);
}

.container--2z-xy {
  padding: 40px;
  background: #fff;
  border-radius: 8px;
  -moz-box-orient: vertical;
  -moz-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  height: calc(100%);
  /*min-height: 100%;
  min-height: -moz-calc(100vh - 208px);
  min-height: calc(100vh - 208px);*/
}

.container--3HDWY .semi-tabs, .container--3HDWY .semi-tabs-pane-motion-overlay, .container--3HDWY .semi-tabs-pane {
  height: 100%;
}

.semi-tabs {
  box-sizing: border-box;
  position: relative;
}

.container--3HDWY .semi-tabs-content {
  /*height: -moz-calc(100% - 53px);*/
  height: 100%;
}

.semi-tabs-content {
  width: 100%;
  padding: 5px 0;
}

.container--3HDWY .semi-tabs, .container--3HDWY .semi-tabs-pane-motion-overlay, .container--3HDWY .semi-tabs-pane {
  height: 100%;
}

.semi-tabs-pane {
  width: 100%;
  overflow: hidden;
}

.chat-container-box--3SEQG .chat-content--2ioZk .semi-tabs-pane-motion-overlay {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
}

.container--3HDWY .semi-tabs, .container--3HDWY .semi-tabs-pane-motion-overlay, .container--3HDWY .semi-tabs-pane {
  height: 100%;
}

.list--Utujj.collapsed--zB87v {
  height: -moz-calc(100vh - 134px);
  height: calc(100vh - 134px);
  overflow-y: auto;
  width: 300px;
}

.list--Utujj {
  height: 100%;
  overflow-y: auto;
}

.box-list-header--1b11B {
  height: 64px;
  padding-top: 0;
  padding-bottom: 0;
  padding-left: 0;
  padding-right: 32px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  /*color: #161823;*/
  font-size: 12px;
  /*border-bottom: 1px solid rgba(22,24,35,0.06);*/
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

.box-list-header--1b11B h1 {
  margin: 0;
  font-size: 24px;
  /*margin-left: 24px;*/
}

.semi-list {
  font-size: 14px;
  line-height: 20px;
  height: calc(100% - 65px);
  font-family: -apple-system,BlinkMacSystemFont,Segoe UI,PingFang SC,Hiragino Sans GB,Microsoft YaHei,Helvetica Neue,Helvetica,Arial,sans-serif;
}

.semi-spin-block.semi-spin {
  height: calc(100%);
  width: 100%;
}

.semi-spin-large, .semi-spin-large>.semi-spin-wrapper svg {
  width: 32px;
  height: 32px;
}

.semi-spin-block {
  display: block;
}

.semi-spin {
  position: relative;
  display: inline-block;
  width: 20px;
  height: 20px;
}

.semi-spin-hidden>.semi-spin-children {
  opacity: 1;
  user-select: auto;
}

.semi-spin-children {
  opacity: .5;
  user-select: none;
}

.semi-list-items {
  margin: 0;
  padding: 0;
  list-style: none;
}

.semi-list-item {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  box-sizing: border-box;
  padding: 12px 24px;
  margin: 0;
  list-style: none;
}

.list--Utujj .semi-list-item-body-flex-start, .list--Utujj .item--KCnu1, .list--Utujj .item-left--3c9d4 {
  width: 100%;
}

.list--Utujj .semi-list-item-body {
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

.semi-list-item-body-flex-start {
  align-items: flex-start;
}

.semi-list-item-body {
  flex: 1;
  display: flex;
}

.list--Utujj .semi-list-item-body-header {
  margin-right: 12px;
}

.semi-list-item-body-header {
  margin-right: 20px;
}

.semi-badge {
  position: relative;
  display: inline-block;
}

.semi-avatar-circle {
  border-radius: 50%;
}

.semi-avatar-medium {
  width: 48px;
  height: 48px;
}

.semi-avatar {
  position: relative;
  display: inline-flex;
  overflow: hidden;
  align-items: center;
  justify-content: center;
  white-space: nowrap;
  text-align: center;
  vertical-align: middle;
}

.semi-avatar>img {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.semi-badge-primary.semi-badge-solid {
  background-color: rgba(254, 44, 85, 1);
}

.semi-badge-rightTop {
  position: absolute;
  top: 0;
  right: 0;
  transform: translate(50%,-50%);
  transform-origin: 100% 0;
}

.list--Utujj .semi-list-item-body-main {
  width: -moz-calc(100% - 60px);
  width: calc(100% - 60px);
}

.list--Utujj .semi-list-item-body-flex-start, .list--Utujj .item--KCnu1, .list--Utujj .item-left--3c9d4 {
  width: 100%;
}

.item--KCnu1 {
  font-size: 14px;
  line-height: 20px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  -moz-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}

.item--KCnu1 .item-left--3c9d4 {
  height: 44px;
}

.list--Utujj .semi-list-item-body-flex-start, .list--Utujj .item--KCnu1, .list--Utujj .item-left--3c9d4 {
  width: 100%;
}

.item--KCnu1 .item-header--TmWg0 {
  padding: 0 1px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
  overflow: hidden;
}

.list--Utujj.collapsed--zB87v .item--KCnu1 .item-header-left--2PGUO {
  width: 130px;
}

.item--KCnu1 .item-header--TmWg0 .item-header-left--2PGUO {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

.list--Utujj.collapsed--zB87v .item--KCnu1 .item-header-name--2tELM {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
  height: 20px;
}

.item--KCnu1 .item-header--TmWg0 .item-header-name--2tELM {
  /*color: #161823;*/
  font-weight: 500;
}

.item--KCnu1 .item-header--TmWg0 .item-header-time--1wYfQ {
  color: rgba(22,24,35,0.5);
  font-size: 12px;
}

.item--KCnu1 .item-content--1_Hjv .text--qZ234 {
  height: 20px;
}

.item--KCnu1 .item-content--1_Hjv div {
  /*color: rgba(35, 28, 31, 1);*/
  margin: 4px 0;
  text-align: initial;
  width: 652px;
  max-width: 100%;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}

.status-wrapper--2kAAJ {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-pack: center;
  -ms-flex-pack: center;
  justify-content: center;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  height: 100%;
}

.resize-triggers, .resize-triggers > div, .contract-trigger:before {
  content: " ";
  display: block;
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  overflow: hidden;
  z-index: -1;
}

.resize-triggers {
  animation: 1ms resizeanim;
  visibility: hidden;
  opacity: 0;
}

.resize-triggers, .resize-triggers > div, .contract-trigger:before {
  content: " ";
  display: block;
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  overflow: hidden;
  z-index: -1;
}

.resize-triggers > div {
  background: #eee;
  overflow: auto;
}

.contract-trigger:before {
  width: 200%;
  height: 200%;
}

.resize-triggers, .resize-triggers > div, .contract-trigger:before {
  content: " ";
  display: block;
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  overflow: hidden;
  z-index: -1;
}

.box-container--3RkLr {
  -moz-box-flex: 1;
  -ms-flex: 1 1;
  flex: 1 1;
  height: -moz-calc(100vh - 124px);
  height: calc(100vh - 124px);
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-orient: vertical;
  -moz-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  border-left: 1px solid rgba(0,0,0,0.08);
  -moz-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}

.box-header--6FAQc {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  padding: 0 25px 0 20px;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  -moz-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
  height: 69px;
  border-bottom: 1px solid rgba(22,24,35,0.06);
  font-size: 12px;
  color: rgba(22,24,35,0.5);
  -ms-flex-negative: 0;
  flex-shrink: 0;
}

.box-header--6FAQc .box-header-name--2ha-- {
  color: #161823;
  font-size: 14px;
  margin-right: 12px;
}

.box-header-tail--1FRis {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  /*color: #000;*/
}

.semi-icons-default {
  width: 16px;
  height: 16px;
}

.semi-icons {
  fill: currentColor;
}

.box-content--3kEi6 {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-orient: vertical;
  -moz-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  height: 608px;
  overflow: auto;
  padding: 0 20px;
  border-bottom: 1px solid rgba(0,0,0,0.08);
}

.semi-button-primary.semi-button-borderless, .semi-button-primary.semi-button-light {
  /*color: rgba(254, 44, 85, 1);*/
}

.box-loadmore--17rAs {
  display: inline-block;
  margin-bottom: 20px;
  /*width: -webkit-max-content;*/
  width: -moz-max-content;
  width: max-content;
  margin: 20px auto;
}
.semi-button-size-small {
  height: 24px;
  padding: 2px 12px;
}

.semi-button-light {
  background-color: rgba(56, 46, 49, 0.05);
}

.semi-button-primary {
  /*background-color: rgba(254, 44, 85, 1);*/
  color: rgba(254, 44, 85, 1);;
}

.semi-button {
  box-shadow: none;
  font-size: 14px;
  line-height: 20px;
  font-family: -apple-system,BlinkMacSystemFont,Segoe UI,PingFang SC,Hiragino Sans GB,Microsoft YaHei,Helvetica Neue,Helvetica,Arial,sans-serif;
  height: 32px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  /*margin: 0;*/
  cursor: pointer;
  user-select: none;
  border: 0 solid transparent;
  border-radius: 3px;
  padding: 6px 12px;
  font-weight: 700;
  outline: none;
  vertical-align: middle;
  white-space: nowrap;
}

.semi-button-light:not(.semi-button-disabled):active {
  background-color: rgba(56, 46, 49, 0.13);
}

.semi-button-light:not(.semi-button-disabled):hover {
  background-color: rgba(56, 46, 49, 0.09);
}



.box-item--TSTUb.is-me--Ynj3O {
  -moz-box-orient: horizontal;
  -moz-box-direction: reverse;
  -ms-flex-direction: row-reverse;
  flex-direction: row-reverse;
  position: relative;
}

.box-item--TSTUb {
  margin-top: 20px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
}

.box-item--TSTUb .box-item-message--G-9W6 {
  background: rgba(0,0,0,0.03);
  border-radius: 8px;
  max-width: 312px;
}

.box-item--TSTUb.is-me--Ynj3O .box-item-message--G-9W6 {
  background: rgba(250,206,21,0.65);
}

.box-item-message--G-9W6 {
  padding: 14px 16px;
}

.box-item--TSTUb .box-item-message--G-9W6 .text--4pkER {
  margin: 0;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 14px;
}

.box-item--TSTUb .box-item-message--G-9W6 pre {
  white-space: pre-wrap;
  word-break: break-all;
}

.box-item--TSTUb:last-child {
  margin-bottom: 40px !important;
}

.semi-avatar-grey {
  background-color: rgba(176, 167, 168,1);
  color: #fff;
}

.loading-screen--3gvJR {
  height: 100%;
  width: 100%;
}


.chat-editor--1P4YJ {
  position: relative;
}

.chat-editor--1P4YJ .chat-input--3G9Sm {
  width: 100%;
  height: 72px;
  text-align: initial;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  outline: 0;
  overflow-y: auto;
  line-height: 20px;
  padding: 20px;
  word-break: break-all;
  font-size: 14px;
}

.chat-editor--1P4YJ .empty--12JDA {
  pointer-events: none;
  display: inline-block;
  font-size: 14px;
  position: absolute;
  color: rgba(0,0,0,0.34);
  top: 20px;
  left: 20px;
}

.chat-footer--3o0AH {
  margin: 16px 20px 20px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}

.chat-editor--1P4YJ .chat-sticker--2BtO- {
  display: block;
  cursor: pointer;
}

.chat-editor--1P4YJ button {
  height: 24px;
  font-size: 12px;
}

.semi-button-disabled, .semi-button-disabled:not(.semi-button-borderless):not(.semi-button-light):hover {
  color: rgba(35, 28, 31, 0.35);
  background-color: rgba(205, 198, 198, 1);
}

.semi-button-disabled {
  cursor: not-allowed;
}
</style>