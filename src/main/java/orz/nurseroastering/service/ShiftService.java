package orz.nurseroastering.service;

import org.jdom.JDOMException;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orz.nurseroastering.domain.NurseRoster;
import orz.nurseroastering.domain.ShiftAssignment;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class ShiftService {

    @Autowired
    NurseRosteringImporter nurseRosteringImporter;

    public List<ShiftAssignment> plan() throws JDOMException, IOException {

        NurseRoster nurseRoster = nurseRosteringImporter.readSolution();

//        File solverConfigFile = ResourceUtils.getFile("classpath:nurseRosteringSolverConfig.xml");
//        SolverFactory<Solution> solverFactory = SolverFactory.createFromXmlFile(solverConfigFile);

        SolverFactory solverFactory =
                SolverFactory.createFromXmlResource("config/nurseRosteringSolverConfig.xml");

        Solver solver = solverFactory.buildSolver();
//
//        EmployeeRoster employeeRoster = new EmployeeRoster();
//        employeeRoster.setCode("TEST");
//        employeeRoster.setSkillList(employeeRepository.listSkills());
//        employeeRoster.setShiftTypeList(shiftRepository.listShiftTypes());
//        employeeRoster.setShiftTypeSkillRequirementList(generateShiftTypeSkillRequirements());
//        employeeRoster.setPatternList(patternsRepository.listAll());
//        employeeRoster.setContractList(contractRepository.listAll());
//        employeeRoster.setContractLineList(generateContractLines());
//        employeeRoster.setPatternContractLineList(generateContractPatternList());
//        employeeRoster.setEmployeeList(employeeRepository.listAll());
//        employeeRoster.setSkillProficiencyList(generateSkillProficiency());
//        employeeRoster.setShiftDateList(shiftRepository.listShiftDates());
//        employeeRoster.setShiftList(shiftRepository.listShifts());
//        employeeRoster.setDayOffRequestList(employeeRepository.listDayOffRequests());
//        employeeRoster.setDayOnRequestList(employeeRepository.listDayOnRequests());
//        employeeRoster.setShiftOffRequestList(employeeRepository.listShiftOffRequests());
//        employeeRoster.setShiftOnRequestList(employeeRepository.listShiftOnRequests());
//        employeeRoster.setEmployeeRosterParametrization(generateEmployeeRosterInfo());
//        employeeRoster.setShiftAssignmentList(generateAssigments());

//        nurseRoster = (EmployeeRoster) solver.solve(nurseRoster);
//        final HardSoftScore score = employeeRoster.getScore();
//        for (ShiftAssignment shiftAssignment : employeeRoster.getShiftAssignmentList()) {
//            shiftRepository.createShiftAssignment(shiftAssignment.getShift(), shiftAssignment.getEmployee());
//        }
//        messageService.informUser(String.format("'%s' score ", score.toString()));
//
//        return shiftRepository.listShiftAssignments();
        return Collections.emptyList();
    }

//    private List<ShiftAssignment> generateAssigments() {
//        List<ShiftAssignment> shiftAssignments = new ArrayList<>();
//        for (Shift shift : shiftRepository.listShifts()) {
//            final ShiftAssignment shiftAssignment = new ShiftAssignment();
//            shiftAssignment.setShift(shift);
//            shiftAssignments.add(shiftAssignment);
//        }
//        return shiftAssignments;
//    }
//
//    private List<SkillProficiency> generateSkillProficiency() {
//        List<SkillProficiency> lines = new ArrayList<>();
//        for (Employee employee : employeeRepository.listAll()) {
//            for (Skill skill : employee.getSkills()) {
//                SkillProficiency skillProficiency = new SkillProficiency();
//                skillProficiency.setEmployee(employee);
//                skillProficiency.setSkill(skill);
//                lines.add(skillProficiency);
//            }
//        }
//        return lines;
//    }
//
//    private List<PatternContractLine> generateContractPatternList() {
//        List<PatternContractLine> lines = new ArrayList<>();
//        for (Contract contract : contractRepository.listAll()) {
//            for (Pattern pattern : contract.getPatternList()) {
//                final PatternContractLine patternContractLine = new PatternContractLine();
//                patternContractLine.setContract(contract);
//                patternContractLine.setPattern(pattern);
//                lines.add(patternContractLine);
//            }
//        }
//        return lines;
//    }
//
//    private List<ContractLine> generateContractLines() {
//        List<ContractLine> contractLines = new ArrayList<>();
//        final List<BooleanContractLine> booleanContractLines = contractRepository.listBooleanContractLineS();
//        final List<MinMaxContractLine> minMaxContractLines = contractRepository.listMinMaxContractLines();
//        contractLines.addAll(booleanContractLines);
//        contractLines.addAll(minMaxContractLines);
//        return contractLines;
//    }
//
//    private List<ShiftTypeSkillRequirement> generateShiftTypeSkillRequirements() {
//        List<ShiftTypeSkillRequirement> shiftTypeSkillRequirements = new ArrayList<>();
//        for (ShiftType shiftType : shiftRepository.listShiftTypes()) {
//            for (Skill skill : shiftType.getSkills()) {
//                final ShiftTypeSkillRequirement requirement = new ShiftTypeSkillRequirement();
//                requirement.setShiftType(shiftType);
//                requirement.setSkill(skill);
//                shiftTypeSkillRequirements.add(requirement);
//            }
//        }
//        return shiftTypeSkillRequirements;
//    }
//
//    private EmployeeRosterParametrization generateEmployeeRosterInfo() {
//        List<ShiftDate> shiftDateList = shiftRepository.listShiftDates();
//        EmployeeRosterParametrization employeeRosterParametrization = new EmployeeRosterParametrization();
//        employeeRosterParametrization.setFirstShiftDate(shiftDateList.get(0));
//        employeeRosterParametrization.setLastShiftDate(shiftDateList.get(shiftDateList.size() - 1));
//        employeeRosterParametrization.setPlanningWindowStart(shiftDateList.get(0));
//        return employeeRosterParametrization;
//    }

}
