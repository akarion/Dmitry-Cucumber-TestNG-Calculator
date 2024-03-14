import subprocess
import sys
import os

def run_gradle_task(task, output_directory, log_dir="Logs"):
    # Get the directory of the script (project directory)
    project_dir = os.path.dirname(os.path.realpath(__file__))
    report_dir_path = os.path.join(project_dir, output_directory)
    log_dir_path = os.path.join(project_dir, log_dir)

    os.makedirs(report_dir_path, exist_ok=True)
    os.makedirs(log_dir_path, exist_ok=True)

    command = f"gradle {task}"

    if task == "unittests" and output_directory:
        command += f" -DoutputDirectory={output_directory}"

    elif task == "scenarios" and output_directory:
        command += f" -PcucumberOutputDir={output_directory}"

    with open(os.path.join(log_dir_path, 'stdout.txt'), 'w') as stdout_file, \
            open(os.path.join(log_dir_path, 'stderr.txt'), 'w') as stderr_file:
        subprocess.run(command, shell=True, stdout=stdout_file, stderr=stderr_file)

if __name__ == "__main__":
    task = sys.argv[1]
    if len(sys.argv) > 2 and task == "unittests":
        output_directory = sys.argv[2]
    elif len(sys.argv) > 2 and task == "scenarios":
        output_directory = sys.argv[2]
    else:
        output_directory = "Reports"

    run_gradle_task(task, output_directory)
