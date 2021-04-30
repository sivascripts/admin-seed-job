job('admin-seed-job') {
    description("admin seed job")
    scm{
        git{
            remote{
              url('http://github.com/sivascripts/jenkins.git')
              credentials("siva_credentials")
            }
            branch('*/main')
            
        }
    }
    steps {
        dsl {
           external('jobs/**/*.groovy')
           removeAction('DELETE')
           removeViewAction('DELETE')

        }
    }
}