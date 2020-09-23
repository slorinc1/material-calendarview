package com.prolificinteractive.materialcalendarview;

import java.util.List;

/**
 * The callback used to indicate a range has been selected
 */
public interface OnRangeSelectedListener {

  /**
   * Called when a user selects a range of days.
   * There is no logic to prevent multiple calls for the same date and state.
   *
   * @param widget the view associated with this listener
   * @param dates the dates in the range, in ascending order
   */
  void onRangeSelected( MaterialCalendarView widget,  List<CalendarDay> dates);
}
