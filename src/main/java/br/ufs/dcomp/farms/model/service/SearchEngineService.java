package br.ufs.dcomp.farms.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufs.dcomp.farms.model.dao.ProjectDao;
import br.ufs.dcomp.farms.model.dao.SearchEngineDao;
import br.ufs.dcomp.farms.model.dto.BaseUseCriteriaCreatedDto;
import br.ufs.dcomp.farms.model.dto.SearchEngineCreatedDto;
import br.ufs.dcomp.farms.model.entity.BaseUseCriteria;
import br.ufs.dcomp.farms.model.entity.Language;
import br.ufs.dcomp.farms.model.entity.Project;
import br.ufs.dcomp.farms.model.entity.SearchEngine;
import br.ufs.dcomp.farms.model.entity.StudyLanguage;

@Component
public class SearchEngineService {

	@Autowired
	private SearchEngineDao searchEngineDao;
	@Autowired
	private ProjectDao projectDao;

	public List<SearchEngineCreatedDto> getByDsKeyProject(String dsKey) {
		List<SearchEngineCreatedDto> searchEngineCreatedDto = new ArrayList<SearchEngineCreatedDto>();
		List<BaseUseCriteria> baseUseCriterias = searchEngineDao.getByDsKeyProject(dsKey);
		if (baseUseCriterias != null) {
			for (BaseUseCriteria searchEngine : baseUseCriterias) {
				searchEngineCreatedDto.add(new SearchEngineCreatedDto(searchEngine));
			}
		}
		return searchEngineCreatedDto;
	}

	public List<SearchEngine> getAllEngines() {
		return searchEngineDao.getAllEngines();
	}

	public Boolean saveEngine(BaseUseCriteriaCreatedDto bcd) {
		BaseUseCriteria bc = new BaseUseCriteria();

		SearchEngine engine = new SearchEngine(bcd.getEngine());
		Project project = projectDao.getByDsKey(bcd.getDsProjectKey());

		bc.setSearchEngine(engine);
		bc.setProject(project);
		bc.setDsBaseUseCriteria(bcd.getDsBaseUseCriteria());

		searchEngineDao.saveBaseUseCriteria(bc);
		return true;
	}
}