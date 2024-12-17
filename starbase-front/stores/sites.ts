
import type { Site } from '~/types';
import { defineStore } from 'pinia';
export const useSitesStore = defineStore('sites', () => {
  const sites = ref<Site[] | null>([])

  const getSites = () => sites.value;

  const fetchSites = async () =>  {
    try {
      const {data, error} = await useFetch<Site[]>('http://localhost:8080/sites/get/all', {
        method: "GET",
        headers: { "Content-Type": "application/json" },
      })
      sites.value = data.value;
    } catch (error) {
      console.error(error);
    }
  }

  return {
    sites,
    fetchSites,
    getSites
  }
});
