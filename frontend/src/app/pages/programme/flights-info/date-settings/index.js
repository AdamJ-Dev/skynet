import { useState } from 'react';
import { useJourneyContext } from '../../../../context/journey/hook';
import { SET_DEPARTURE_DATE, SET_RETURN_DATE } from '../../../../context/journey/provider';

import styles from './index.module.css';

const FlightDateSettings = () => {
  const [departureDate, setDepartureDate] = useState('');
  const [returnDate, setReturnDate] = useState('');
  const [isReturn, setIsReturn] = useState(false);
  const { dispatch } = useJourneyContext();

  const handleDepartureDateChange = (e) => {
    const date = e.target.value;
    setDepartureDate(date);
    dispatch({ type: SET_DEPARTURE_DATE, payload: date || null });
  };

  const handleReturnDateChange = (e) => {
    const date = e.target.value;
    setReturnDate(date);
    dispatch({ type: SET_RETURN_DATE, payload: date || null });
  };

  const handleCheckReturn = (e) => {
    const checked = e.target.checked;
    setIsReturn(checked);
    if (!checked) {
      setReturnDate('');
      dispatch({ type: SET_RETURN_DATE, payload: null });
    }
  };

  return (
    <div className={styles.dateSettingsContainer}>
      <form className={styles.dateSettingsForm}>
        <div className={styles.formGroup}>
          <label htmlFor="departure-date">Departure Date:&nbsp;</label>
          <input id="departure-date" type="date" value={departureDate} onChange={handleDepartureDateChange} />
        </div>
        <div className={styles.formGroup}>
          <label htmlFor="is-return">Return Flight?&nbsp;</label>
          <input id="is-return" type="checkbox" checked={isReturn} onChange={handleCheckReturn} />
        </div>
        {isReturn && (
          <div className={styles.formGroup}>
            <label htmlFor="return-date">Return Date:&nbsp;</label>
            <input id="return-date" type="date" value={returnDate} onChange={handleReturnDateChange} />
          </div>
        )}
      </form>
    </div>
  );
};

export default FlightDateSettings;
