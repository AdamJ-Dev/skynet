import { useState } from 'react';
import { getResponseError } from '../utility/data-fetching/getResponseError';
import { getGenericErrorMessage } from '../../config/messages/selectors';

const defaultPostingHeaders = { 'Content-Type': 'application/json' };
const defaultErrorParser = (e) => getGenericErrorMessage();

const useFetch = (initialUrl) => {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(false);

  const executeFetch = async (fetchMethod, errorParser) => {
    setLoading(true);
    setError(null);
    try {
      const res = await fetchMethod();
      if (!res.ok) {
        throw getResponseError(res);
      }
      const data = await res.json();
      setData(data);
    } catch (error) {
      setError(errorParser(error));
    } finally {
      setLoading(false);
    }
  };

  const get = async ({ url = initialUrl, errorParser = defaultErrorParser } = {}) => {
    executeFetch(async () => await fetch(url), errorParser);
  };

  const post = async (
    json,
    { url = initialUrl, errorParser = defaultErrorParser, extraHeaders = {} } = {}
  ) => {
    executeFetch(
      async () =>
        await fetch(url, {
          method: 'POST',
          headers: { ...defaultPostingHeaders, extraHeaders },
          body: JSON.stringify(json),
        }),
      errorParser
    );
  };

  const put = async (
    json,
    { url = initialUrl, errorParser = defaultErrorParser, extraHeaders = {} } = {}
  ) => {
    executeFetch(
      async () =>
        await fetch(url, {
          method: 'PUT',
          headers: { ...defaultPostingHeaders, extraHeaders },
          body: JSON.stringify(json),
        }),
      errorParser
    );
  };

  const del = async ({ url = initialUrl, errorParser = defaultErrorParser, extraHeaders = {} } = {}) => {
    executeFetch(async () => await fetch(url, { method: 'DELETE', headers: extraHeaders }), errorParser);
  };

  return { data, error, loading, get, post, put, del };
};

export default useFetch;
