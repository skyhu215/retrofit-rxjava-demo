package com.example.rxjavademo.model;

public class ReposModule {

    /*{
            "id": 106628867,
            "node_id": "MDEwOlJlcG9zaXRvcnkxMDY2Mjg4Njc=",
            "name": "discourse_docker",
            "full_name": "1/discourse_docker",
            "private": false,
            "owner": {
                "login": "1",
                "id": 1825798,
                "node_id": "MDQ6VXNlcjE4MjU3OTg=",
                "avatar_url": "https://avatars2.githubusercontent.com/u/1825798?v=4",
                "gravatar_id": "",
                "url": "https://api.github.com/users/1",
                "html_url": "https://github.com/1",
                "followers_url": "https://api.github.com/users/1/followers",
                "following_url": "https://api.github.com/users/1/following{/other_user}",
                "gists_url": "https://api.github.com/users/1/gists{/gist_id}",
                "starred_url": "https://api.github.com/users/1/starred{/owner}{/repo}",
                "subscriptions_url": "https://api.github.com/users/1/subscriptions",
                "organizations_url": "https://api.github.com/users/1/orgs",
                "repos_url": "https://api.github.com/users/1/repos",
                "events_url": "https://api.github.com/users/1/events{/privacy}",
                "received_events_url": "https://api.github.com/users/1/received_events",
                "type": "User",
                "site_admin": false
             },
             "html_url": "https://github.com/1/discourse_docker",
            "description": "A Docker image for Discourse",
            "fork": true,
            "url": "https://api.github.com/repos/1/discourse_docker",
            "forks_url": "https://api.github.com/repos/1/discourse_docker/forks",
            "keys_url": "https://api.github.com/repos/1/discourse_docker/keys{/key_id}",
            "collaborators_url": "https://api.github.com/repos/1/discourse_docker/collaborators{/collaborator}",
            "teams_url": "https://api.github.com/repos/1/discourse_docker/teams",
            "hooks_url": "https://api.github.com/repos/1/discourse_docker/hooks",
            "issue_events_url": "https://api.github.com/repos/1/discourse_docker/issues/events{/number}",
            "events_url": "https://api.github.com/repos/1/discourse_docker/events",
            "assignees_url": "https://api.github.com/repos/1/discourse_docker/assignees{/user}",
            "branches_url": "https://api.github.com/repos/1/discourse_docker/branches{/branch}",
            "tags_url": "https://api.github.com/repos/1/discourse_docker/tags",
            "blobs_url": "https://api.github.com/repos/1/discourse_docker/git/blobs{/sha}",
            "git_tags_url": "https://api.github.com/repos/1/discourse_docker/git/tags{/sha}",
            "git_refs_url": "https://api.github.com/repos/1/discourse_docker/git/refs{/sha}",
            "trees_url": "https://api.github.com/repos/1/discourse_docker/git/trees{/sha}",
            "statuses_url": "https://api.github.com/repos/1/discourse_docker/statuses/{sha}",
            "languages_url": "https://api.github.com/repos/1/discourse_docker/languages",
            "stargazers_url": "https://api.github.com/repos/1/discourse_docker/stargazers",
            "contributors_url": "https://api.github.com/repos/1/discourse_docker/contributors",
            "subscribers_url": "https://api.github.com/repos/1/discourse_docker/subscribers",
            "subscription_url": "https://api.github.com/repos/1/discourse_docker/subscription",
            "commits_url": "https://api.github.com/repos/1/discourse_docker/commits{/sha}",
            "git_commits_url": "https://api.github.com/repos/1/discourse_docker/git/commits{/sha}",
            "comments_url": "https://api.github.com/repos/1/discourse_docker/comments{/number}",
            "issue_comment_url": "https://api.github.com/repos/1/discourse_docker/issues/comments{/number}",
            "contents_url": "https://api.github.com/repos/1/discourse_docker/contents/{+path}",
            "compare_url": "https://api.github.com/repos/1/discourse_docker/compare/{base}...{head}",
            "merges_url": "https://api.github.com/repos/1/discourse_docker/merges",
            "archive_url": "https://api.github.com/repos/1/discourse_docker/{archive_format}{/ref}",
            "downloads_url": "https://api.github.com/repos/1/discourse_docker/downloads",
            "issues_url": "https://api.github.com/repos/1/discourse_docker/issues{/number}",
            "pulls_url": "https://api.github.com/repos/1/discourse_docker/pulls{/number}",
            "milestones_url": "https://api.github.com/repos/1/discourse_docker/milestones{/number}",
            "notifications_url": "https://api.github.com/repos/1/discourse_docker/notifications{?since,all,participating}",
            "labels_url": "https://api.github.com/repos/1/discourse_docker/labels{/name}",
            "releases_url": "https://api.github.com/repos/1/discourse_docker/releases{/id}",
            "deployments_url": "https://api.github.com/repos/1/discourse_docker/deployments",
            "created_at": "2017-10-12T01:26:04Z",
            "updated_at": "2017-10-12T01:26:06Z",
            "pushed_at": "2017-10-11T17:38:12Z",
            "git_url": "git://github.com/1/discourse_docker.git",
            "ssh_url": "git@github.com:1/discourse_docker.git",
            "clone_url": "https://github.com/1/discourse_docker.git",
            "svn_url": "https://github.com/1/discourse_docker",
            "homepage": "http://www.discourse.org",
            "size": 776,
            "stargazers_count": 0,
            "watchers_count": 0,
            "language": "Shell",
            "has_issues": false,
            "has_projects": true,
            "has_downloads": true,
            "has_wiki": true,
            "has_pages": false,
            "forks_count": 0,
            "mirror_url": null,
            "archived": false,
            "disabled": false,
            "open_issues_count": 0,
            "license": null,
            "forks": 0,
            "open_issues": 0,
            "watchers": 0,
            "default_branch": "master"
    }*/


    private Long id;
    private String nodeId;
    private String name;
    private String fullName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
