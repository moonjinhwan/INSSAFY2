export default {
  namespaced: true,
  state: {
    // 추가기능 체크 flag
    isCheckList: false,
    isCalendar: false,
    isVote: false,
    isRank: false,
  },
  getters: {

  },
  mutations: {
    // response에서 받아오는 부분
    IS_USED(state, data) {
      state.isCheckList = data.checklist_flag
      state.isCalendar = data.calendar_flag
      state.isVote = data.vote_flag
    },
  },
  actions: {
    isUsed({commit}, addfunc) {
      commit('IS_USED', addfunc)
    },
  },
}