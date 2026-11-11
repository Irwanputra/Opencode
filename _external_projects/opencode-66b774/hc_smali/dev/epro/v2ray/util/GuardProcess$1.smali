.class public Ldev/epro/v2ray/util/GuardProcess$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/epro/v2ray/util/GuardProcess;->start(Ldev/epro/v2ray/util/Callback;Landroid/content/Context;)Ldev/epro/v2ray/util/GuardProcess;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Ldev/epro/v2ray/util/GuardProcess;

.field public final synthetic val$context:Landroid/content/Context;

.field public final synthetic val$restartCallback:Ldev/epro/v2ray/util/Callback;

.field public final synthetic val$semaphore:Ljava/util/concurrent/Semaphore;


# direct methods
.method public constructor <init>(Ldev/epro/v2ray/util/GuardProcess;Landroid/content/Context;Ldev/epro/v2ray/util/Callback;Ljava/util/concurrent/Semaphore;)V
    .registers 5

    iput-object p1, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    iput-object p2, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$restartCallback:Ldev/epro/v2ray/util/Callback;

    iput-object p4, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$semaphore:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 8

    const/4 v0, 0x0

    :goto_1
    :try_start_1
    iget-object v1, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # getter for: Ldev/epro/v2ray/util/GuardProcess;->isDestroyed:Z
    invoke-static {v1}, Ldev/epro/v2ray/util/GuardProcess;->access$000(Ldev/epro/v2ray/util/GuardProcess;)Z

    move-result v1

    if-nez v1, :cond_6b

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    new-instance v4, Ljava/lang/ProcessBuilder;

    iget-object v5, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # getter for: Ldev/epro/v2ray/util/GuardProcess;->cmd:Ljava/util/List;
    invoke-static {v5}, Ldev/epro/v2ray/util/GuardProcess;->access$200(Ldev/epro/v2ray/util/GuardProcess;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/ProcessBuilder;-><init>(Ljava/util/List;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    move-result-object v4

    iget-object v6, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/ProcessBuilder;->directory(Ljava/io/File;)Ljava/lang/ProcessBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v4

    # setter for: Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;
    invoke-static {v3, v4}, Ldev/epro/v2ray/util/GuardProcess;->access$102(Ldev/epro/v2ray/util/GuardProcess;Ljava/lang/Process;)Ljava/lang/Process;

    if-nez v0, :cond_35

    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$restartCallback:Ldev/epro/v2ray/util/Callback;

    goto :goto_38

    :cond_35
    invoke-interface {v0}, Ldev/epro/v2ray/util/Callback;->callback()V

    :goto_38
    iget-object v3, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v3}, Ljava/util/concurrent/Semaphore;->release()V

    iget-object v3, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # getter for: Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;
    invoke-static {v3}, Ldev/epro/v2ray/util/GuardProcess;->access$100(Ldev/epro/v2ray/util/GuardProcess;)Ljava/lang/Process;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Process;->waitFor()I

    monitor-enter p0
    :try_end_47
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_47} :catch_73
    .catchall {:try_start_1 .. :try_end_47} :catchall_71

    :try_start_47
    iget-object v3, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # getter for: Ldev/epro/v2ray/util/GuardProcess;->isRestart:Z
    invoke-static {v3}, Ldev/epro/v2ray/util/GuardProcess;->access$300(Ldev/epro/v2ray/util/GuardProcess;)Z

    move-result v3

    if-eqz v3, :cond_56

    iget-object v1, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    const/4 v2, 0x0

    # setter for: Ldev/epro/v2ray/util/GuardProcess;->isRestart:Z
    invoke-static {v1, v2}, Ldev/epro/v2ray/util/GuardProcess;->access$302(Ldev/epro/v2ray/util/GuardProcess;Z)Z

    goto :goto_66

    :cond_56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/16 v1, 0x3e8

    cmp-long v6, v3, v1

    if-gez v6, :cond_66

    iget-object v1, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # setter for: Ldev/epro/v2ray/util/GuardProcess;->isDestroyed:Z
    invoke-static {v1, v5}, Ldev/epro/v2ray/util/GuardProcess;->access$002(Ldev/epro/v2ray/util/GuardProcess;Z)Z

    :cond_66
    :goto_66
    monitor-exit p0

    goto :goto_1

    :catchall_68
    move-exception v0

    monitor-exit p0
    :try_end_6a
    .catchall {:try_start_47 .. :try_end_6a} :catchall_68

    :try_start_6a
    throw v0
    :try_end_6b
    .catch Ljava/lang/Exception; {:try_start_6a .. :try_end_6b} :catch_73
    .catchall {:try_start_6a .. :try_end_6b} :catchall_71

    :cond_6b
    :goto_6b
    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_85

    :catchall_71
    move-exception v0

    goto :goto_86

    :catch_73
    :try_start_73
    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # getter for: Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;
    invoke-static {v0}, Ldev/epro/v2ray/util/GuardProcess;->access$100(Ldev/epro/v2ray/util/GuardProcess;)Ljava/lang/Process;

    move-result-object v0

    if-eqz v0, :cond_6b

    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess$1;->this$0:Ldev/epro/v2ray/util/GuardProcess;

    # getter for: Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;
    invoke-static {v0}, Ldev/epro/v2ray/util/GuardProcess;->access$100(Ldev/epro/v2ray/util/GuardProcess;)Ljava/lang/Process;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
    :try_end_84
    .catchall {:try_start_73 .. :try_end_84} :catchall_71

    goto :goto_6b

    :goto_85
    return-void

    :goto_86
    iget-object v1, p0, Ldev/epro/v2ray/util/GuardProcess$1;->val$semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_8d

    :goto_8c
    throw v0

    :goto_8d
    goto :goto_8c
.end method
